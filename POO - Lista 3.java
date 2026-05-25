//Exercício 1
class Pessoa {
    protected String nome;
    protected int idade;

    public void cadastrar(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public void cadastrarAluno(String nome, int idade, String matricula, String curso) {
        cadastrar(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void exibirAluno() {
        exibirDados();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.cadastrarAluno("Maria", 20, "2024001", "Computação");

        aluno.exibirAluno();
    }
}

//Exercicio 2
class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    public Professor(String nome, int idade, String disciplina, double salario) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void exibirProfessor() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salário: R$ " + salario);
    }
}

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Carlos", 35, "Matemática", 3500);

        professor.exibirProfessor();
    }
}

//Exercicio 3
class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}

class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public void exibirCarro() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Portas: " + quantidadePortas);
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public void exibirMoto() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindradas: " + cilindradas);
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Uno", 4);
        Moto moto = new Moto("Honda", "CG", 160);

        carro.exibirCarro();
        System.out.println();
        moto.exibirMoto();
    }
}

//Exercicio 4
class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}

class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public void exibirGerente() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Setor: " + setor);
    }
}

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", 5000, "Administrativo");

        gerente.exibirGerente();
    }
}

//Exercicio 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = entrada.nextInt();
            soma += numeros[i];
        }

        System.out.println("Valores digitados:");

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("Soma: " + soma);
    }
}

//Exercicio 6
class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String matricula, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void exibirAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("----------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[3];

        alunos[0] = new Aluno("Maria", 20, "001", "Computação");
        alunos[1] = new Aluno("João", 22, "002", "Administração");
        alunos[2] = new Aluno("Ana", 19, "003", "Pedagogia");

        for (int i = 0; i < alunos.length; i++) {
            alunos[i].exibirAluno();
        }
    }
}

//Exercicio 7
class Carro {
    private String marca;
    private String modelo;
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        this.marca = marca;
        this.modelo = modelo;
        this.quantidadePortas = quantidadePortas;
    }

    public void exibirCarro() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Portas: " + quantidadePortas);
        System.out.println("----------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro[] carros = new Carro[4];

        carros[0] = new Carro("Fiat", "Uno", 4);
        carros[1] = new Carro("Volkswagen", "Gol", 4);
        carros[2] = new Carro("Chevrolet", "Onix", 4);
        carros[3] = new Carro("Ford", "Ka", 2);

        for (int i = 0; i < carros.length; i++) {
            carros[i].exibirCarro();
        }
    }
}

//Exercicio 8
class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Tipo: Aluno");
        System.out.println("----------------");
    }
}

class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Tipo: Professor");
        System.out.println("----------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[4];

        pessoas[0] = new Aluno("Maria", 20, "001");
        pessoas[1] = new Aluno("João", 21, "002");
        pessoas[2] = new Professor("Carlos", 40, "Matemática");
        pessoas[3] = new Professor("Ana", 35, "Português");

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].exibirDados();
        }
    }
}

//Exercicio 9
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Beatriz");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("Quantidade total: " + nomes.size());
    }
}

//Exercicio 10
import java.util.ArrayList;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("----------------");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Caderno", 25.00));
        produtos.add(new Produto("Caneta", 3.50));
        produtos.add(new Produto("Mochila", 120.00));
        produtos.add(new Produto("Lápis", 2.00));
        produtos.add(new Produto("Estojo", 35.00));

        Produto maisCaro = produtos.get(0);

        for (Produto p : produtos) {
            p.exibirProduto();

            if (p.getPreco() > maisCaro.getPreco()) {
                maisCaro = p;
            }
        }

        System.out.println("Produto mais caro:");
        maisCaro.exibirProduto();
    }
}

//Exercicio 11
import java.util.ArrayList;

class Professor {
    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void exibirProfessor() {
        System.out.println("Nome: " + nome);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salário: R$ " + salario);
        System.out.println("----------------");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Professor> professores = new ArrayList<>();

        professores.add(new Professor("Carlos", "Matemática", 3500));
        professores.add(new Professor("Ana", "Português", 3200));
        professores.add(new Professor("Marcos", "História", 3000));

        for (Professor p : professores) {
            p.exibirProfessor();
        }

        String nomeBusca = "Ana";

        for (Professor p : professores) {
            if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Professor encontrado:");
                p.exibirProfessor();
            }
        }
    }
}

//Exercicio 12
import java.util.ArrayList;

class Aluno {
    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void exibirAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("----------------");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Maria", "001"));
        alunos.add(new Aluno("João", "002"));
        alunos.add(new Aluno("Ana", "003"));

        String matriculaRemover = "002";

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMatricula().equals(matriculaRemover)) {
                alunos.remove(i);
                break;
            }
        }

        for (Aluno a : alunos) {
            a.exibirAluno();
        }
    }
}

//Exercicio 13
import java.util.ArrayList;

class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
    }
}

class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Curso: " + curso);
        System.out.println("Tipo: Aluno");
    }
}

class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Tipo: Professor");
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoasArray = new Pessoa[2];

        pessoasArray[0] = new Aluno("Maria", "Computação");
        pessoasArray[1] = new Professor("Carlos", "Matemática");

        System.out.println("USANDO ARRAY:");
        for (Pessoa p : pessoasArray) {
            p.exibirDados();
            System.out.println("----------------");
        }

        ArrayList<Pessoa> pessoasLista = new ArrayList<>();

        pessoasLista.add(new Aluno("Ana", "Direito"));
        pessoasLista.add(new Professor("João", "História"));

        System.out.println("USANDO ARRAYLIST:");
        for (Pessoa p : pessoasLista) {
            p.exibirDados();
            System.out.println("----------------");
        }
    }
}

//Exercicio 14
import java.util.ArrayList;

class Livro {
    protected String titulo;
    protected String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibirLivro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}

class LivroDidatico extends Livro {
    private String disciplina;

    public LivroDidatico(String titulo, String autor, String disciplina) {
        super(titulo, autor);
        this.disciplina = disciplina;
    }

    public void exibirLivro() {
        super.exibirLivro();
        System.out.println("Disciplina: " + disciplina);
    }
}

public class Main {
    public static void main(String[] args) {
        Livro[] livrosArray = new Livro[3];

        livrosArray[0] = new Livro("Dom Casmurro", "Machado de Assis");
        livrosArray[1] = new LivroDidatico("Matemática Fácil", "José Silva", "Matemática");
        livrosArray[2] = new Livro("A Moreninha", "Joaquim Manuel de Macedo");

        System.out.println("ARRAY:");
        for (Livro l : livrosArray) {
            l.exibirLivro();
            System.out.println("----------------");
        }

        ArrayList<Livro> livrosLista = new ArrayList<>();

        livrosLista.add(new Livro("O Pequeno Príncipe", "Saint-Exupéry"));
        livrosLista.add(new LivroDidatico("História do Brasil", "Maria Souza", "História"));

        System.out.println("ARRAYLIST:");
        for (Livro l : livrosLista) {
            l.exibirLivro();
            System.out.println("----------------");
        }
    }
}

//Exercicio 15
import java.util.ArrayList;

class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
    }
}

class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Setor: " + setor);
        System.out.println("Cargo: Gerente");
    }
}

class Estagiario extends Funcionario {
    private String curso;

    public Estagiario(String nome, double salario, String curso) {
        super(nome, salario);
        this.curso = curso;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Curso: " + curso);
        System.out.println("Cargo: Estagiário");
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionariosArray = new Funcionario[2];

        funcionariosArray[0] = new Gerente("Ana", 5000, "Financeiro");
        funcionariosArray[1] = new Estagiario("Pedro", 1200, "Computação");

        System.out.println("ARRAY:");
        for (Funcionario f : funcionariosArray) {
            f.exibirDados();
            System.out.println("----------------");
        }

        ArrayList<Funcionario> funcionariosLista = new ArrayList<>();

        funcionariosLista.add(new Gerente("Carlos", 6000, "RH"));
        funcionariosLista.add(new Estagiario("Mariana", 1300, "Administração"));

        System.out.println("ARRAYLIST:");
        for (Funcionario f : funcionariosLista) {
            f.exibirDados();
            System.out.println("----------------");
        }
    }
}

//Exercicio 16
import java.util.ArrayList;

class Funcionario {
    protected String nome;
    protected String cargo;
    protected double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
        System.out.println("----------------");
    }
}

class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, "Gerente", salario);
        this.setor = setor;
    }
}

class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, "Vendedor", salario);
        this.comissao = comissao;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Ana", 6000, "Financeiro"));
        funcionarios.add(new Vendedor("João", 2500, 500));
        funcionarios.add(new Funcionario("Carlos", "Auxiliar", 1800));

        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }
    }
}

//Exercicio 17
import java.util.ArrayList;

class Contato {
    protected String nome;
    protected String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void exibirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}

class ContatoPessoal extends Contato {
    private String aniversario;

    public ContatoPessoal(String nome, String telefone, String aniversario) {
        super(nome, telefone);
        this.aniversario = aniversario;
    }
}

class ContatoProfissional extends Contato {
    private String empresa;

    public ContatoProfissional(String nome, String telefone, String empresa) {
        super(nome, telefone);
        this.empresa = empresa;
    }

    public void exibirContato() {
        super.exibirContato();
        System.out.println("Empresa: " + empresa);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(new ContatoPessoal("Maria", "9999-0000", "10/05"));
        contatos.add(new ContatoProfissional("Carlos", "9888-1111", "Tech LTDA"));

        System.out.println("TODOS OS CONTATOS:");
        for (Contato c : contatos) {
            c.exibirContato();
            System.out.println("----------------");
        }

        System.out.println("CONTATOS PROFISSIONAIS:");
        for (Contato c : contatos) {
            if (c instanceof ContatoProfissional) {
                c.exibirContato();
                System.out.println("----------------");
            }
        }
    }
}

//Exercicio 18
import java.util.ArrayList;

class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void exibirDados() {
        System.out.println("Animal: " + nome);
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    public void exibirDados() {
        System.out.println("Cachorro: " + nome);
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    public void exibirDados() {
        System.out.println("Gato: " + nome);
    }
}

class Passaro extends Animal {
    public Passaro(String nome) {
        super(nome);
    }

    public void exibirDados() {
        System.out.println("Pássaro: " + nome);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animaisArray = new Animal[3];

        animaisArray[0] = new Cachorro("Rex");
        animaisArray[1] = new Gato("Mimi");
        animaisArray[2] = new Passaro("Louro");

        System.out.println("ARRAY:");
        for (Animal a : animaisArray) {
            a.exibirDados();
        }

        ArrayList<Animal> animaisLista = new ArrayList<>();

        animaisLista.add(new Cachorro("Bob"));
        animaisLista.add(new Gato("Nina"));
        animaisLista.add(new Passaro("Piu"));

        System.out.println("ARRAYLIST:");
        for (Animal a : animaisLista) {
            a.exibirDados();
        }
    }
}

//Exercicio 19
import java.util.ArrayList;

class Midia {
    protected String titulo;
    protected int ano;

    public Midia(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
    }
}

class Filme extends Midia {
    public Filme(String titulo, int ano) {
        super(titulo, ano);
    }
}

class Musica extends Midia {
    public Musica(String titulo, int ano) {
        super(titulo, ano);
    }
}

class Podcast extends Midia {
    public Podcast(String titulo, int ano) {
        super(titulo, ano);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Midia> midias = new ArrayList<>();

        midias.add(new Filme("Titanic", 1997));
        midias.add(new Musica("Imagine", 1971));
        midias.add(new Podcast("Tecnologia Hoje", 2024));
        midias.add(new Filme("Avatar", 2009));

        int qtdFilmes = 0;
        int qtdMusicas = 0;
        int qtdPodcasts = 0;

        for (Midia m : midias) {
            m.exibirDados();

            if (m instanceof Filme) {
                System.out.println("Tipo: Filme");
                qtdFilmes++;
            } else if (m instanceof Musica) {
                System.out.println("Tipo: Música");
                qtdMusicas++;
            } else if (m instanceof Podcast) {
                System.out.println("Tipo: Podcast");
                qtdPodcasts++;
            }

            System.out.println("----------------");
        }

        System.out.println("Quantidade de filmes: " + qtdFilmes);
        System.out.println("Quantidade de músicas: " + qtdMusicas);
        System.out.println("Quantidade de podcasts: " + qtdPodcasts);
    }
}

//Exercicio 20
import java.util.ArrayList;

class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
    }
}

class Aluno extends Pessoa {
    public Aluno(String nome) {
        super(nome);
    }
}

class Professor extends Pessoa {
    public Professor(String nome) {
        super(nome);
    }
}

class Coordenador extends Pessoa {
    public Coordenador(String nome) {
        super(nome);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Aluno("Maria"));
        pessoas.add(new Professor("Carlos"));
        pessoas.add(new Coordenador("Ana"));

        System.out.println("LISTAGEM GERAL:");
        for (Pessoa p : pessoas) {
            p.exibirDados();
        }

        System.out.println("LISTAGEM POR TIPO:");
        for (Pessoa p : pessoas) {
            if (p instanceof Aluno) {
                System.out.println(p.getNome() + " é aluno.");
            } else if (p instanceof Professor) {
                System.out.println(p.getNome() + " é professor.");
            } else if (p instanceof Coordenador) {
                System.out.println(p.getNome() + " é coordenador.");
            }
        }

        String busca = "Ana";

        for (Pessoa p : pessoas) {
            if (p.getNome().equalsIgnoreCase(busca)) {
                System.out.println("Pessoa encontrada: " + p.getNome());
            }
        }
    }
}

//Exercicio 21
import java.util.ArrayList;

class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}

class ProdutoFisico extends Produto {
    private double peso;

    public ProdutoFisico(String nome, double preco, double peso) {
        super(nome, preco);
        this.peso = peso;
    }
}

class ProdutoDigital extends Produto {
    private double tamanhoArquivo;

    public ProdutoDigital(String nome, double preco, double tamanhoArquivo) {
        super(nome, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new ProdutoFisico("Livro", 50, 0.5));
        produtos.add(new ProdutoDigital("Curso Online", 120, 2.0));
        produtos.add(new ProdutoFisico("Caderno", 25, 0.3));

        double total = 0;

        for (Produto p : produtos) {
            p.exibirProduto();
            total += p.getPreco();

            if (p instanceof ProdutoFisico) {
                System.out.println("Tipo: Produto físico");
            } else if (p instanceof ProdutoDigital) {
                System.out.println("Tipo: Produto digital");
            }

            System.out.println("----------------");
        }

        System.out.println("Valor total: R$ " + total);
    }
}

//Exercicio 22
//Array é usado quando sabemos a quantidade fixa de elementos que serão armazenados. Por exemplo, se o programa precisa guardar exatamente 5 números, o array é suficiente.
//ArrayList é usado quando a quantidade de elementos pode mudar durante a execução do programa. Ele permite adicionar e remover elementos com mais facilidade.
//A principal vantagem do array é ser simples e direto. A sua limitação é que seu tamanho é fixo.
//A principal vantagem do ArrayList é ser dinâmico. A sua limitação é que precisa importar a classe ArrayList e usar métodos como add(), remove() e size().

//Exercicio 23
//Exercício 5 feito com ArrayList
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            numeros.add(numero);
            soma += numero;
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("Soma: " + soma);
    }
}

//O que mudou: no lugar de int[] numeros = new int[5], foi usado ArrayList<Integer>.
//O que ficou mais fácil: adicionar elementos com add().
//O que deixou de ser necessário: controlar manualmente o tamanho fixo do array.

//Exercicio 24
import java.util.ArrayList;

class Pet {
    protected String nome;

    public Pet(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
    }
}

class Cachorro extends Pet {
    public Cachorro(String nome) {
        super(nome);
    }
}

class Gato extends Pet {
    public Gato(String nome) {
        super(nome);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();

        pets.add(new Cachorro("Rex"));
        pets.add(new Gato("Mimi"));
        pets.add(new Cachorro("Bob"));

        System.out.println("LISTA GERAL:");
        for (Pet p : pets) {
            p.exibirDados();
        }

        String busca = "Mimi";

        for (Pet p : pets) {
            if (p.getNome().equalsIgnoreCase(busca)) {
                System.out.println("Pet encontrado: " + p.getNome());
            }
        }

        String remover = "Bob";

        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getNome().equalsIgnoreCase(remover)) {
                pets.remove(i);
                break;
            }
        }

        System.out.println("LISTA APÓS REMOÇÃO:");
        for (Pet p : pets) {
            p.exibirDados();
        }
    }
}

//Exercicio 25
//a) O que é herança? Herança é um recurso da programação orientada a objetos que permite que uma classe aproveite atributos e métodos de outra classe.
//b) Qual a diferença entre classe base e subclasse? A classe base, também chamada de superclasse, é a classe principal. A subclasse é a classe que herda características da classe base.
//c) O que é um array? Array é uma estrutura que armazena vários valores do mesmo tipo em uma única variável, com tamanho fixo.
//d) O que é um ArrayList? ArrayList é uma lista dinâmica que permite armazenar vários elementos e aumentar ou diminuir seu tamanho durante a execução do programa.
//e) Qual a principal diferença entre array e ArrayList? O array tem tamanho fixo. O ArrayList tem tamanho dinâmico e permite adicionar e remover elementos com mais facilidade.
//f) Por que uma ArrayList<Pessoa> pode armazenar Aluno e Professor? Porque Aluno e Professor são subclasses de Pessoa. Então, pela herança, eles também podem ser tratados como objetos do tipo Pessoa.
