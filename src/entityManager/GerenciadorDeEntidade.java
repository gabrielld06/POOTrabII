/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.EntityManager;

/**
 *
 * @author Gabriel
 */
public class GerenciadorDeEntidade<Entity> {
        // Cria um gerenciado de entidade para gerenciar as entidades do programa
        // Um pojo é tratado como uma entidade no mapeamento objeto-relacional
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("trabalhoPU");
        EntityManager em = emf.createEntityManager();      
        
        // se der merda colocar o return
        public void inserir(Entity entity) {
            try {
                em.getTransaction().begin();
                em.persist(entity);
                em.getTransaction().commit();
            } catch(Exception E) {
                em.getTransaction().rollback();
                System.out.println(E);
            } finally {
                em.close();
            }
        }
        
        public void atualiza(Entity entity) {
            try {
                em.getTransaction().begin();
                //em.find(entity.getClass(), );
                //if (a != null){
                 //   a.setEndereco("Av. Colombo");
                //}
                // TESTAR
                em.getTransaction().commit();
            } catch(Exception E) {
                em.getTransaction().rollback();
                System.out.println(E);
            } finally {
                em.close();
            }
        }
        
        public void remove(Entity entity) {
            try {
                em.getTransaction().begin();
                //r = em.find(r.getClass(), new Integer(1));
                //if (r != null)
                    //em.remove(r);
                em.getTransaction().commit();
            } catch(Exception E) {
                em.getTransaction().rollback();
                System.out.println(E);
            } finally {
                em.close();
            }
        }
        /*
        // Inserindo uma pessoa
        Pessoa u = new Pessoa();
        u.setNome("Joao");
        u.setEndereco("R. Brasil");
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        
        // Atualizando os dados de uma pessoa
        Pessoa a = new Pessoa();
        em.getTransaction().begin();
        a = em.find(a.getClass(), new Integer(1));
        if (a != null){
            a.setEndereco("Av. Colombo");
        }
        em.getTransaction().commit();
        
        // Recuperando os dados de uma pessoa
        Pessoa r = new Pessoa();
        em.getTransaction().begin();
        r = em.find(r.getClass(), new Integer(1));
        em.getTransaction().commit();
        System.out.println("Nome: " + r.getNome() + " Endereco: " + r.getEndereco());
        
        // Removendo uma pessoa da tabela no banco de dados
        em.getTransaction().begin();
        r = em.find(r.getClass(), new Integer(1));
        if (r != null)
            em.remove(r);
        em.getTransaction().commit();
        
        // Finalizando o gerenciador de entidades e a fabrica
        em.close();
        emf.close();*/
}
