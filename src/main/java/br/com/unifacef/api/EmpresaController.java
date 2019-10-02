package br.com.unifacef.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacef.dtos.EmpresaDTO;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {
	
	@GetMapping 
	public String exemplo() {
		return "Funcionou";
	}
	
	@GetMapping (value = "/{nome}")
	public String exemplo2(@PathVariable("nome")String nome) {
		return "Nome da empresa " + nome ;
	}
	
	@PostMapping //mapeamento pra post
	public ResponseEntity<EmpresaDTO> cadastrar(@RequestBody EmpresaDTO empresaDTO){
		empresaDTO.setId(1L);
		//retorna ao usuario o objeto cadastrado com o ID 1
		return ResponseEntity.ok(empresaDTO);
	}
	
}
