//Exercicio 1
class CPF {
    private String numero;
    private String situacao;

    public CPF(String numero, String situacao) {
        this.numero = numero;
        this.situacao = situacao;
    }

    public void exibirDados() {
        System.out.println("CPF: " + numero);
        System.out.println("Situação: " + situacao);
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private CPF cpf;

    public Pessoa(String nome, int idade, CPF cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        cpf.exibirDados();
    }
}

public class Main {
    public static void main(String[] args) {

        CPF cpf = new CPF("123.456.789-00", "Regular");

        Pessoa pessoa = new Pessoa("João", 25, cpf);

        pessoa.exibirDados();
    }
}

//Exercicio 2
class Carteirinha {
    private String numero;
    private String dataEmissao;

    public Carteirinha(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
    }

    public void exibirCarteirinha() {
        System.out.println("Número: " + numero);
        System.out.println("Data de emissão: " + dataEmissao);
    }
}

class Aluno {
    private String nome;
    private String curso;
    private Carteirinha carteirinha;

    public Aluno(String nome, String curso, Carteirinha carteirinha) {
        this.nome = nome;
        this.curso = curso;
        this.carteirinha = carteirinha;
    }

    public void exibirAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        carteirinha.exibirCarteirinha();
    }
}

public class Main {
    public static void main(String[] args) {

        Carteirinha c = new Carteirinha("2026", "25/05/2026");

        Aluno aluno = new Aluno("Maria", "Computação", c);

        aluno.exibirAluno();
    }
}

//Exercicio 3
class Motor {
    private String tipo;
    private int potencia;
    private String numeroSerie;

    public Motor(String tipo, int potencia, String numeroSerie) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.numeroSerie = numeroSerie;
    }

    public void exibirMotor() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Potência: " + potencia);
        System.out.println("Número de série: " + numeroSerie);
    }
}

class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void ligarCarro() {
        System.out.println("Carro ligado!");
    }

    public void exibirFichaTecnica() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        motor.exibirMotor();
    }
}

public class Main {
    public static void main(String[] args) {

        Motor motor = new Motor("Flex", 120, "ABC123");

        Carro carro = new Carro("Fiat", "Uno", motor);

        carro.ligarCarro();
        carro.exibirFichaTecnica();
    }
}

//Exercicio 4
class PlacaMae {
    private String modelo;
    private String chipset;

    public PlacaMae(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public void exibirPlacaMae() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Chipset: " + chipset);
    }
}

class Computador {
    private String marca;
    private String processador;
    private PlacaMae placaMae;

    public Computador(String marca, String processador, PlacaMae placaMae) {
        this.marca = marca;
        this.processador = processador;
        this.placaMae = placaMae;
    }

    public void exibirConfiguracao() {
        System.out.println("Marca: " + marca);
        System.out.println("Processador: " + processador);
        placaMae.exibirPlacaMae();
    }
}

public class Main {
    public static void main(String[] args) {

        PlacaMae placa = new PlacaMae("ASUS", "Intel");

        Computador pc = new Computador("Dell", "i5", placa);

        pc.exibirConfiguracao();
    }
}

//Exercicio 5
class ISBN {
    private String codigo;
    private String editora;

    public ISBN(String codigo, String editora) {
        this.codigo = codigo;
        this.editora = editora;
    }

    public void exibirISBN() {
        System.out.println("Código: " + codigo);
        System.out.println("Editora: " + editora);
    }
}

class Livro {
    private String titulo;
    private String autor;
    private ISBN isbn;

    public Livro(String titulo, String autor, ISBN isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public void exibirLivro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        isbn.exibirISBN();
    }
}

public class Main {
    public static void main(String[] args) {

        ISBN isbn = new ISBN("978-85", "Moderna");

        Livro livro = new Livro("Era Uma Vez Um Coração Partido", "Stephanie Garber", isbn);

        livro.exibirLivro();
    }
}

//Exercício 6
class Cracha {
    private String codigo;
    private String dataValidade;

    public Cracha(String codigo, String dataValidade) {
        this.codigo = codigo;
        this.dataValidade = dataValidade;
    }

    public void exibirCracha() {
        System.out.println("Código: " + codigo);
        System.out.println("Validade: " + dataValidade);
    }
}

class Funcionario {
    private String nome;
    private String cargo;
    private Cracha cracha;

    public Funcionario(String nome, String cargo, Cracha cracha) {
        this.nome = nome;
        this.cargo = cargo;
        this.cracha = cracha;
    }

    public void exibirFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        cracha.exibirCracha();
    }
}

public class Main {
    public static void main(String[] args) {

        Cracha cracha = new Cracha("001", "31/12/2026");

        Funcionario funcionario = new Funcionario("Ana", "Gerente", cracha);

        funcionario.exibirFuncionario();
    }
}

//Exercício 7
class Prontuario {
    private String numeroRegistro;
    private String tipoSanguineo;
    private String alergias;

    public Prontuario(String numeroRegistro, String tipoSanguineo, String alergias) {
        this.numeroRegistro = numeroRegistro;
        this.tipoSanguineo = tipoSanguineo;
        this.alergias = alergias;
    }

    public void exibirProntuario() {
        System.out.println("Registro: " + numeroRegistro);
        System.out.println("Tipo sanguíneo: " + tipoSanguineo);
        System.out.println("Alergias: " + alergias);
    }
}

class Paciente {
    private String nome;
    private int idade;
    private Prontuario prontuario;

    public Paciente(String nome, int idade, Prontuario prontuario) {
        this.nome = nome;
        this.idade = idade;
        this.prontuario = prontuario;
    }

    public void exibirPaciente() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        prontuario.exibirProntuario();
    }
}

public class Main {
    public static void main(String[] args) {

        Prontuario p = new Prontuario("123", "O+", "Nenhuma");

        Paciente paciente = new Paciente("Lucas", 20, p);

        paciente.exibirPaciente();
    }
}

//Exercício 8
class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;

    public Endereco(String rua, int numero, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public void exibirEndereco() {
        System.out.println("Rua: " + rua);
        System.out.println("Número: " + numero);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
    }
}

class Casa {
    private String cor;
    private int quantidadeQuartos;
    private Endereco endereco;

    public Casa(String cor, int quantidadeQuartos, Endereco endereco) {
        this.cor = cor;
        this.quantidadeQuartos = quantidadeQuartos;
        this.endereco = endereco;
    }

    public void exibirCasa() {
        System.out.println("Cor: " + cor);
        System.out.println("Quartos: " + quantidadeQuartos);
        endereco.exibirEndereco();
    }
}

public class Main {
    public static void main(String[] args) {

        Endereco e = new Endereco("Rua A", 10, "Centro", "Sarandi");

        Casa casa = new Casa("Azul", 3, e);

        casa.exibirCasa();
    }
}

//Exercício 9
class CNPJ {
    private String numero;
    private String situacaoCadastral;

    public CNPJ(String numero, String situacaoCadastral) {
        this.numero = numero;
        this.situacaoCadastral = situacaoCadastral;
    }

    public void exibirCNPJ() {
        System.out.println("CNPJ: " + numero);
        System.out.println("Situação: " + situacaoCadastral);
    }
}

class Empresa {
    private String razaoSocial;
    private String nomeFantasia;
    private CNPJ cnpj;

    public Empresa(String razaoSocial, String nomeFantasia, CNPJ cnpj) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public void exibirEmpresa() {
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        cnpj.exibirCNPJ();
    }
}

public class Main {
    public static void main(String[] args) {

        CNPJ cnpj = new CNPJ("12.345.678/0001-00", "Ativo");

        Empresa empresa = new Empresa("Empresa LTDA", "Loja X", cnpj);

        empresa.exibirEmpresa();
    }
}

//Exerício 10
class Perfil {
    private String bio;
    private String foto;
    private String visibilidade;

    public Perfil(String bio, String foto, String visibilidade) {
        this.bio = bio;
        this.foto = foto;
        this.visibilidade = visibilidade;
    }

    public void exibirPerfil() {
        System.out.println("Bio: " + bio);
        System.out.println("Foto: " + foto);
        System.out.println("Visibilidade: " + visibilidade);
    }
}

class Usuario {
    private String login;
    private String email;
    private Perfil perfil;

    public Usuario(String login, String email, Perfil perfil) {
        this.login = login;
        this.email = email;
        this.perfil = perfil;
    }

    public void exibirUsuario() {
        System.out.println("Login: " + login);
        System.out.println("Email: " + email);
        perfil.exibirPerfil();
    }
}

public class Main {
    public static void main(String[] args) {

        Perfil perfil = new Perfil(
                "Olá, sou estudante!",
                "foto.jpg",
                "Público"
        );

        Usuario usuario = new Usuario(
                "juliana",
                "ra12950@uem.br",
                perfil
        );

        usuario.exibirUsuario();
    }
}