/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.List;

/**
 *
 * @author Penguin
 */
public interface RepositorioGenerico <T>{
     public void inserir(T t);
    public void alterar(T t);
    public T recuperar(int codigo);
     public T recuperar(String cpf);
    public void excluir(int codigo);
    public void excluir(T t);
    public List<T> recuperarTodos();
}