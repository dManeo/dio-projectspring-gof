package dio.projectspring.gof.service;

import dio.projectspring.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementeções dessa mesma
 * interface.
 *
 * @author dManeo
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscadorPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
