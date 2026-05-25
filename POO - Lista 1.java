//Exercício 1
class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ana");
        pessoa.setIdade(20);

        pessoa.exibirDados();
    }
}

//Exercício 2
class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.setNome("Caderno");
        p1.setPreco(25.50);

        p2.setNome("Caneta");
        p2.setPreco(3.00);

        p1.mostrarInformacoes();
        p2.mostrarInformacoes();
    }
}

//Exercício 3
class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void verificarSituacao() {
        if (calcularMedia() >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Carlos");
        aluno.setMatricula("2024001");
        aluno.setNota1(8.0);
        aluno.setNota2(7.0);

        System.out.println("Média: " + aluno.calcularMedia());
        aluno.verificarSituacao();
    }
}

//Exercício 4
class Retangulo {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();

        r.setBase(5);
        r.setAltura(3);

        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
    }
}

//Exercício 5
class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumero(123);
        conta.setTitular("Maria");
        conta.setSaldo(500);

        conta.depositar(200);
        conta.sacar(100);
        conta.consultarSaldo();
    }
}

//Exercício 6
class Carro {
    private String marca;
    private String modelo;
    private int velocidade;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if (velocidade >= 0) {
            this.velocidade = velocidade;
        }
    }

    public void acelerar() {
        velocidade += 10;
    }

    public void frear() {
        velocidade -= 10;

        if (velocidade < 0) {
            velocidade = 0;
        }
    }

    public void mostrarVelocidade() {
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("Fiat");
        carro.setModelo("Uno");
        carro.setVelocidade(0);

        carro.acelerar();
        carro.acelerar();
        carro.frear();

        carro.mostrarVelocidade();
    }
}

//Exercício 7
class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * percentual / 100;
    }

    public void exibirFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        f.setNome("João");
        f.setCargo("Vendedor");
        f.setSalario(2000);

        f.aumentarSalario(10);
        f.exibirFuncionario();
    }
}

//Exercício 8
class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestarLivro() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado.");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolverLivro() {
        emprestado = false;
        System.out.println("Livro devolvido.");
    }

    public void verificarDisponibilidade() {
        if (emprestado) {
            System.out.println("Livro indisponível.");
        } else {
            System.out.println("Livro disponível.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setTitulo("Dom Casmurro");
        livro.setAutor("Machado de Assis");
        livro.setEmprestado(false);

        livro.verificarDisponibilidade();
        livro.emprestarLivro();
        livro.verificarDisponibilidade();
    }
}

//Exercício 9
class Celular {
    private String marca;
    private String modelo;
    private int nivelBateria;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria >= 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;
        }
    }

    public void carregar(int valor) {
        nivelBateria += valor;

        if (nivelBateria > 100) {
            nivelBateria = 100;
        }
    }

    public void usar(int valor) {
        nivelBateria -= valor;

        if (nivelBateria < 0) {
            nivelBateria = 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Celular c = new Celular();

        c.setMarca("Samsung");
        c.setModelo("Galaxy");
        c.setNivelBateria(50);

        c.usar(20);
        c.carregar(80);

        System.out.println("Bateria: " + c.getNivelBateria() + "%");
    }
}

//Exercício 10
class Filme {
    private String titulo;
    private String genero;
    private int duracao;
    private double avaliacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        if (avaliacao >= 0 && avaliacao <= 10) {
            this.avaliacao = avaliacao;
        }
    }

    public void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Avaliação: " + avaliacao);
    }

    public void alterarAvaliacao(double novaAvaliacao) {
        if (novaAvaliacao >= 0 && novaAvaliacao <= 10) {
            avaliacao = novaAvaliacao;
        } else {
            System.out.println("Avaliação inválida.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setTitulo("Divertida Mente");
        filme.setGenero("Animação");
        filme.setDuracao(95);
        filme.setAvaliacao(9.0);

        filme.alterarAvaliacao(9.5);
        filme.exibirFichaTecnica();
    }
}

//Execício 11
class Paciente {
    private String nome;
    private double peso;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public void classificarIMC() {
        double imc = calcularIMC();

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Paciente p = new Paciente();

        p.setNome("Ana");
        p.setPeso(60);
        p.setAltura(1.65);

        System.out.println("IMC: " + p.calcularIMC());
        p.classificarIMC();
    }
}

//Exercício 12
class ReservaHotel {
    private String nomeHospede;
    private int quantidadeDiarias;
    private double valorDiaria;

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }

    public void setQuantidadeDiarias(int quantidadeDiarias) {
        this.quantidadeDiarias = quantidadeDiarias;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double calcularTotal() {
        return quantidadeDiarias * valorDiaria;
    }

    public void exibirReserva() {
        System.out.println("Hóspede: " + nomeHospede);
        System.out.println("Diárias: " + quantidadeDiarias);
        System.out.println("Valor da diária: R$ " + valorDiaria);
        System.out.println("Total: R$ " + calcularTotal());
    }
}

public class Main {
    public static void main(String[] args) {
        ReservaHotel reserva = new ReservaHotel();

        reserva.setNomeHospede("Luciana");
        reserva.setQuantidadeDiarias(3);
        reserva.setValorDiaria(150);

        reserva.exibirReserva();
    }
}

//Exercício 13
class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void adicionarPontos(int valor) {
        pontuacao += valor;

        while (pontuacao >= 100) {
            subirNivel();
            pontuacao -= 100;
        }
    }

    public void subirNivel() {
        nivel++;
    }
}

public class Main {
    public static void main(String[] args) {
        Jogador j = new Jogador();

        j.setNome("Pedro");
        j.setPontuacao(0);
        j.setNivel(1);

        j.adicionarPontos(250);

        System.out.println("Nome: " + j.getNome());
        System.out.println("Pontuação restante: " + j.getPontuacao());
        System.out.println("Nível: " + j.getNivel());
    }
}

//Exercício 14
class Contato {
    private String nome;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void exibirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-mail: " + email);
    }

    public void alterarTelefone(String novoTelefone) {
        telefone = novoTelefone;
    }
}

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.setNome("Mariana");
        contato.setTelefone("99999-0000");
        contato.setEmail("mariana@email.com");

        contato.alterarTelefone("98888-1111");
        contato.exibirContato();
    }
}

//Exercício 15
class LivroBiblioteca {
    private String titulo;
    private String autor;
    private int codigo;
    private boolean disponivel;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Livro indisponível.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido com sucesso.");
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Código: " + codigo);
        System.out.println("Disponível: " + disponivel);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        LivroBiblioteca l1 = new LivroBiblioteca();
        LivroBiblioteca l2 = new LivroBiblioteca();
        LivroBiblioteca l3 = new LivroBiblioteca();

        l1.setTitulo("O Pequeno Príncipe");
        l1.setAutor("Antoine de Saint-Exupéry");
        l1.setCodigo(1);
        l1.setDisponivel(true);

        l2.setTitulo("Dom Casmurro");
        l2.setAutor("Machado de Assis");
        l2.setCodigo(2);
        l2.setDisponivel(true);

        l3.setTitulo("Era Uma Vez Um Coração Partido");
        l3.setAutor("Stephanie Garber");
        l3.setCodigo(3);
        l3.setDisponivel(true);

        l1.emprestar();
        l2.emprestar();
        l2.devolver();

        l1.exibirInformacoes();
        l2.exibirInformacoes();
        l3.exibirInformacoes();
    }
}