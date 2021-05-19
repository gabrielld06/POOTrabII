/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityManager;

import POJO.Consulta;
import POJO.DadosAdicionais;
import POJO.Paciente;
import POJO.Prontuario;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

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
    public int inserir(Entity entity) {
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            return 1;
        } catch (Exception E) {
            em.getTransaction().rollback();
            System.out.println(E);
            return 0;
        }
    }

    public int atualiza() {
        try {
            em.getTransaction().begin();
            em.getTransaction().commit();
            return 1;
        } catch (Exception E) {
            em.getTransaction().rollback();
            System.out.println(E);
            return 0;
        }
    }

    public int remove(Entity entity) {
        try {
            em.getTransaction().begin();
            em.remove(entity);
            em.getTransaction().commit();
            return 1;
        } catch (Exception E) {
            em.getTransaction().rollback();
            System.out.println(E);
            return 0;
        }
    }

    public List<Paciente> getPacientes() {
        return em.createQuery("SELECT a FROM Paciente a", Paciente.class).getResultList();
    }

    public List<Paciente> getPacientesSemConsulta() {
        return em.createQuery("SELECT a FROM Paciente a WHERE a.consulta IS NULL", Paciente.class).getResultList();
    }

    public Paciente buscaPaciente(int idPaciente) {
        return em.find(Paciente.class, idPaciente);
    }

    public List<Paciente> buscaPacienteConsultas() {
        return em.createQuery("SELECT a FROM Paciente a WHERE a.consulta IS NOT NULL", Paciente.class).getResultList();
    }

    public List<Paciente> buscaPacienteProntuarios() {
        return em.createQuery("SELECT a FROM Paciente a WHERE a.prontuario IS NOT NULL", Paciente.class).getResultList();
    }

    public List<Paciente> buscaPacienteSemProntuarios() {
        return em.createQuery("SELECT a FROM Paciente a WHERE a.prontuario IS NULL", Paciente.class).getResultList();
    }

    public List<Paciente> buscaPacienteSemDadosAdicionais() {
        return em.createQuery("SELECT a FROM Paciente a WHERE a.dadosAdicionais IS NULL", Paciente.class).getResultList();
    }

    public List<Consulta> buscaConsultasAmanha(String str) {
        return em.createQuery("SELECT a FROM Consulta a WHERE " + str + "a.data = {d '"
                + LocalDate.now().plusDays(1).toString()
                + "'}", Consulta.class).getResultList();
    }

    public Consulta buscaConsulta(int id) {
        return em.createQuery("SELECT a FROM Consulta a WHERE a.idConsulta = :id", Consulta.class).setParameter("id", id).getSingleResult();
    }

    public int atualizaPaciente() {
        try {
            em.getTransaction().begin();
            em.getTransaction().commit();
            return 1;
        } catch (Exception E) {
            em.getTransaction().rollback();
            System.out.println(E);
            return 0;
        }
    }

    public List<Paciente> getPacientesDadosAdicionais() {
        return em.createQuery("SELECT a FROM Paciente a WHERE a.dadosAdicionais IS NOT NULL", Paciente.class).getResultList();
    }

    public DadosAdicionais buscaDadosAdicionais(int idDadosAdicionais) {
        return em.find(DadosAdicionais.class, idDadosAdicionais);
    }

    public List<Consulta> buscaConsultasMes() {
        return em.createQuery("SELECT a FROM Consulta a WHERE a.data < {d '"
                + LocalDate.now().toString() + "'} AND a.data >= {d '"
                + LocalDate.now().withDayOfMonth(1).toString()
                + "'}", Consulta.class).getResultList();
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
