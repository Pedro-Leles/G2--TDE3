package controller;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class ControleCurso {
    private List<Curso> cursos = new ArrayList<>();

    public void cadastrarCurso(Curso curso) throws CampoObrigatorioException {
        if (curso.get_titulo() == null || curso.get_titulo().isEmpty())
            throw new CampoObrigatorioException("Título do curso é obrigatório.");
        cursos.add(curso);
    }

    public List<Curso> listarCursos() {
        return cursos;
    }

    public Curso buscarCurso(String nome) throws CursoNaoEncontradoException {
        return cursos.stream()
                .filter(c -> c.get_titulo().equalsIgnoreCase(nome))
                .findFirst()
                .orElseThrow(() -> new CursoNaoEncontradoException("Curso não encontrado."));
    }

    public void removerCurso(String nome) throws CursoNaoEncontradoException {
        Curso curso = buscarCurso(nome);
        cursos.remove(curso);
    }
}
