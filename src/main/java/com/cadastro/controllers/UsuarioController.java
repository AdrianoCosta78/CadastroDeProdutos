package com.cadastro.controllers;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cadastro.model.Produto;
import com.cadastro.model.Usuario;
import com.cadastro.repositories.UsuarioRepository;
import com.cadastro.services.UsuarioService;
import com.cadastro.util.Util;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	

	
	
	@GetMapping("/")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Login/login");
		return mv;
		
	}
	
	@PostMapping("/login")
	public String login(Usuario usuario ,RedirectAttributes ra ,HttpSession session ) throws NoSuchAlgorithmException {
		
		usuario = this.usuarioRepository.findByEmailAndSenha(usuario.getEmail(), Util.md5(usuario.getSenha()));
		
		if(usuario != null) {
		session.setAttribute("usuarioLogado", usuario);
			return "home/index";
			
		}else {
			ra.addAttribute("mensagem", "Email ou senha inválidos");
			return "redirect:/";
		}
		

//		@PostMapping("/Sair")
//		public String Sair(HttpSession session) {
//			session.invalidate();
//			return "redirect:/";
//		}
		
		
//		usuario = this.usuarioRepository.findByLogin(usuario.getEmail(), usuario.getSenha());
//		if(usuario != null) {
//			session.setAttribute("usuarioLogado", usuario);
//			return "redirect:home/teste";
//		}else {
//			ra.addAttribute("erro", "Usuário ou senha inválidos");
//			return "redirect:/";
//		}
//		
	}
	
	
//	@PostMapping("/login")
//	public ModelAndView login(@Valid Usuario usuario, BindingResult br, HttpSession session)throws NoSuchAlgorithmException, ServiceExc {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("usuario", new Usuario());
//		if(br.hasErrors()) {
//			mv.setViewName("/");
//		}
//		
//		Usuario userLogin = usuarioService.loginUser(usuario.getEmail(), Util.md5(usuario.getSenha()));
//		if(userLogin == null) {
//			mv.addObject("msg", "Usuário ou senha incorreto(s)");
//		}else {
//			session.setAttribute("usuarioLogado", userLogin);
//			return index();
//		}
//		return mv;
//		
//	}
	
	@GetMapping("/cadastro")
	public ModelAndView cadastrar() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("usuario", new Usuario());
		mv.setViewName("Login/cadastro");
		return mv;
	}
	
	@PostMapping("/salvarUsuario")
	public ModelAndView salvarUsuario(Usuario usuario) throws Exception {
		ModelAndView mv = new ModelAndView();
		usuarioService.salvarUsuario(usuario);
		mv.setViewName("redirect:/");
		return mv;
	}
	
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/index");
		mv.addObject("produto",new Produto());
		return mv;
	}
	
}

