package jv.triersistemas.primeiro_projeto.service;

import java.util.List;
import java.util.Map;

import jv.triersistemas.primeiro_projeto.dto.CategoriaDto;
import jv.triersistemas.primeiro_projeto.entity.CategoriaEntity;

public interface CategoriaService {
	CategoriaDto salvarCategoria(CategoriaDto categoriaDto);
	List<CategoriaDto> buscarTodasCategoria();
	CategoriaDto buscarCategoria(Long id);
	CategoriaDto atualizarCategoria(Long id, CategoriaDto categoriaDto);
	void deletarCategoria(Long id);
	CategoriaEntity buscaIdBanco(Long id);

	Map<CategoriaDto, Integer> buscarContagemTarefaCategoria();
}
