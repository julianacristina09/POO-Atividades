//Exercicio 1

//Etapa 1 – Interpretação
//Classes: Usuario, Produto
//Atributos: usuário com nome e tipo; produto com nome e preco
//Enum: TipoUsuario com ADMIN e PADRAO
//Regra: somente ADMIN pode cadastrar produto
//Método principal: cadastrarProduto()
//Se permitido: produto cadastrado
//Se não permitido: acesso negado

//Etapa 2 – Pseudocódigo
//Criar usuário.
//Verificar se o tipo do usuário é ADMIN.
//Se for ADMIN, cadastrar produto.
//Senão, mostrar mensagem de erro.

//Etapa 3 – Código Java
enum TipoUsuario {
    ADMIN, PADRAO
}

class Usuario {
    String nome;
    TipoUsuario tipo;

    public Usuario(String nome, TipoUsuario tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}

class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

public class Main {
    public static void cadastrarProduto(Usuario usuario, Produto produto) {
        if (usuario.tipo == TipoUsuario.ADMIN) {
            System.out.println("Produto cadastrado: " + produto.nome);
        } else {
            System.out.println("Acesso negado. Apenas ADMIN pode cadastrar produto.");
        }
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana", TipoUsuario.ADMIN);
        Produto produto = new Produto("Notebook", 3000);

        cadastrarProduto(usuario, produto);
    }
}

//Exercício 2

//Etapa 1 – Interpretação
//Classes: Usuario, Comentario
//Enum: TipoUsuario
//Regra: somente usuário PADRAO pode publicar comentário
//Método principal: publicarComentario()
//Se permitido: comentário publicado
//Se não permitido: publicação negada

//Etapa 2 – Pseudocódigo
//Verificar tipo do usuário.
//Se for PADRAO, publicar comentário.
//Caso contrário, negar publicação.

//Etapa 3 – Código Java
enum TipoUsuario {
    ADMIN, PADRAO
}

class Usuario {
    String nome;
    TipoUsuario tipo;

    public Usuario(String nome, TipoUsuario tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}

class Comentario {
    String texto;

    public Comentario(String texto) {
        this.texto = texto;
    }
}

public class Main {
    public static void publicarComentario(Usuario usuario, Comentario comentario) {
        if (usuario.tipo == TipoUsuario.PADRAO) {
            System.out.println("Comentário publicado: " + comentario.texto);
        } else {
            System.out.println("Apenas usuários PADRAO podem publicar comentários.");
        }
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos", TipoUsuario.PADRAO);
        Comentario comentario = new Comentario("Muito interessante!");

        publicarComentario(usuario, comentario);
    }
}

//Exercicio 3

//Etapa 1 – Interpretação
//Classes: Usuario, Noticia
//Enum: TipoUsuario com VISITANTE, ADMIN
//Regra: visitante pode visualizar, mas não pode cadastrar notícia
//Métodos principais: visualizarNoticia() e cadastrarNoticia()

//Etapa 2 – Pseudocódigo
//Todo usuário pode visualizar notícia.
//Para cadastrar, verificar se não é visitante.
//Se for visitante, negar cadastro.

//Etapa 3 – Código Java
enum TipoUsuario {
    ADMIN, VISITANTE
}

class Usuario {
    String nome;
    TipoUsuario tipo;

    public Usuario(String nome, TipoUsuario tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}

class Noticia {
    String titulo;

    public Noticia(String titulo) {
        this.titulo = titulo;
    }
}

public class Main {
    public static void visualizarNoticia(Usuario usuario, Noticia noticia) {
        System.out.println(usuario.nome + " visualizou a notícia: " + noticia.titulo);
    }

    public static void cadastrarNoticia(Usuario usuario, Noticia noticia) {
        if (usuario.tipo == TipoUsuario.ADMIN) {
            System.out.println("Notícia cadastrada: " + noticia.titulo);
        } else {
            System.out.println("Visitante não pode cadastrar notícias.");
        }
    }

    public static void main(String[] args) {
        Usuario visitante = new Usuario("João", TipoUsuario.VISITANTE);
        Noticia noticia = new Noticia("Nova tecnologia lançada");

        visualizarNoticia(visitante, noticia);
        cadastrarNoticia(visitante, noticia);
    }
}

//Exercicio 4

//Etapa 1 – Interpretação
//Classes: Aluno, Livro
//Enum: StatusAluno com ATIVO e INATIVO
//Regra: aluno só reserva livro se estiver ATIVO
//Método principal: reservarLivro()

//Etapa 2 – Pseudocódigo
//Verificar status do aluno.
//Se estiver ATIVO, reservar o livro.
//Se não estiver, negar reserva.

//Etapa 3 – Código Java
enum StatusAluno {
    ATIVO, INATIVO
}

class Aluno {
    String nome;
    StatusAluno status;

    public Aluno(String nome, StatusAluno status) {
        this.nome = nome;
        this.status = status;
    }
}

class Livro {
    String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }
}

public class Main {
    public static void reservarLivro(Aluno aluno, Livro livro) {
        if (aluno.status == StatusAluno.ATIVO) {
            System.out.println("Livro reservado: " + livro.titulo);
        } else {
            System.out.println("Reserva negada. Aluno inativo.");
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", StatusAluno.ATIVO);
        Livro livro = new Livro("Java Básico");

        reservarLivro(aluno, livro);
    }
}

//Exercicio 5

//Etapa 1 – Interpretação
//Classe: Tarefa
//Enum: StatusTarefa
//Regra: só pode concluir se estiver EM_ANDAMENTO
//Método principal: concluirTarefa()
//Se permitido: status muda para CONCLUIDA
//Se não: mensagem de erro

//Etapa 2 – Pseudocódigo
//Verificar status da tarefa.
//Se estiver EM_ANDAMENTO, mudar para CONCLUIDA.
//Caso contrário, não concluir.

//Etapa 3 – Código Java
enum StatusTarefa {
    PENDENTE, EM_ANDAMENTO, CONCLUIDA
}

class Tarefa {
    String titulo;
    StatusTarefa status;

    public Tarefa(String titulo, StatusTarefa status) {
        this.titulo = titulo;
        this.status = status;
    }

    public void concluirTarefa() {
        if (status == StatusTarefa.EM_ANDAMENTO) {
            status = StatusTarefa.CONCLUIDA;
            System.out.println("Tarefa concluída: " + titulo);
        } else {
            System.out.println("A tarefa não pode ser concluída nesse status.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Estudar Java", StatusTarefa.EM_ANDAMENTO);

        tarefa.concluirTarefa();
    }
}

//Exercicio 6

//Etapa 1 – Interpretação
//Classes: Professor, Turma
//Atributos: curso do professor e curso da turma
//Regra: professor só lança nota se o curso for igual
//Método principal: lancarNota()

//Etapa 2 – Pseudocódigo
//Comparar curso do professor com curso da turma.
//Se forem iguais, lançar nota.
//Se forem diferentes, negar.

//Etapa 3 – Código Java
class Professor {
    String nome;
    String curso;

    public Professor(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }
}

class Turma {
    String nome;
    String curso;

    public Turma(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }
}

public class Main {
    public static void lancarNota(Professor professor, Turma turma, double nota) {
        if (professor.curso.equalsIgnoreCase(turma.curso)) {
            System.out.println("Nota " + nota + " lançada para a turma " + turma.nome);
        } else {
            System.out.println("Professor não pode lançar nota para turma de outro curso.");
        }
    }

    public static void main(String[] args) {
        Professor professor = new Professor("Carlos", "Computação");
        Turma turma = new Turma("Turma A", "Computação");

        lancarNota(professor, turma, 8.5);
    }
}

//Exercicio 7

//Etapa 1 – Interpretação
//Classes: Usuario, Atividade
//Atributos: atividade possui um responsável
//Regra: só o responsável pode remover
//Método principal: removerAtividade()

//Etapa 2 – Pseudocódigo
//Comparar usuário com responsável da atividade.
//Se forem iguais, remover.
//Se não, negar remoção.

//Etapa 3 – Código Java
class Usuario {
    String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }
}

class Atividade {
    String titulo;
    Usuario responsavel;

    public Atividade(String titulo, Usuario responsavel) {
        this.titulo = titulo;
        this.responsavel = responsavel;
    }
}

public class Main {
    public static void removerAtividade(Usuario usuario, Atividade atividade) {
        if (usuario.nome.equalsIgnoreCase(atividade.responsavel.nome)) {
            System.out.println("Atividade removida: " + atividade.titulo);
        } else {
            System.out.println("Apenas o responsável pode remover esta atividade.");
        }
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana");
        Atividade atividade = new Atividade("Fazer relatório", usuario);

        removerAtividade(usuario, atividade);
    }
}

//Exercicio 8

//Etapa 1 – Interpretação
//Classe: Pedido
//Enum: StatusPedido
//Regra: só cancela se estiver PENDENTE
//Método principal: cancelarPedido()
//Se permitido: status muda para CANCELADO
//Se não: cancelamento negado

//Etapa 2 – Pseudocódigo
//Verificar status do pedido.
//Se for PENDENTE, cancelar.
//Caso contrário, negar cancelamento.

//Etapa 3 – Código Java
enum StatusPedido {
    PENDENTE, ENVIADO, ENTREGUE, CANCELADO
}

class Pedido {
    int numero;
    StatusPedido status;

    public Pedido(int numero, StatusPedido status) {
        this.numero = numero;
        this.status = status;
    }

    public void cancelarPedido() {
        if (status == StatusPedido.PENDENTE) {
            status = StatusPedido.CANCELADO;
            System.out.println("Pedido cancelado.");
        } else {
            System.out.println("Pedido não pode ser cancelado.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(101, StatusPedido.PENDENTE);

        pedido.cancelarPedido();
    }
}

//Exercicio 9

//Etapa 1 – Interpretação
//Classes: Usuario, Solicitacao
//Enum: TipoUsuario com GERENTE e PADRAO
//Regra: PADRAO cria solicitação; GERENTE aprova
//Métodos principais: criarSolicitacao() e aprovarSolicitacao()

//Etapa 2 – Pseudocódigo
//Se usuário for PADRAO, pode criar solicitação.
//Se usuário for GERENTE, pode aprovar solicitação.
//Caso contrário, negar ação.

//Etapa 3 – Código Java
enum TipoUsuario {
    GERENTE, PADRAO
}

class Usuario {
    String nome;
    TipoUsuario tipo;

    public Usuario(String nome, TipoUsuario tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}

class Solicitacao {
    String descricao;
    boolean aprovada;

    public Solicitacao(String descricao) {
        this.descricao = descricao;
        this.aprovada = false;
    }
}

public class Main {
    public static void criarSolicitacao(Usuario usuario, Solicitacao solicitacao) {
        if (usuario.tipo == TipoUsuario.PADRAO) {
            System.out.println("Solicitação criada: " + solicitacao.descricao);
        } else {
            System.out.println("Apenas usuário PADRAO cria solicitações.");
        }
    }

    public static void aprovarSolicitacao(Usuario usuario, Solicitacao solicitacao) {
        if (usuario.tipo == TipoUsuario.GERENTE) {
            solicitacao.aprovada = true;
            System.out.println("Solicitação aprovada.");
        } else {
            System.out.println("Apenas gerente pode aprovar solicitações.");
        }
    }

    public static void main(String[] args) {
        Usuario comum = new Usuario("Maria", TipoUsuario.PADRAO);
        Usuario gerente = new Usuario("Carlos", TipoUsuario.GERENTE);

        Solicitacao solicitacao = new Solicitacao("Comprar material");

        criarSolicitacao(comum, solicitacao);
        aprovarSolicitacao(gerente, solicitacao);
    }
}

//Exercicio 10

//Etapa 1 – Interpretação
//Classe: Usuario
//Enum: TipoUsuario com ADMIN e PADRAO
//Regra: ADMIN só pode criar usuário PADRAO
//Método principal: criarUsuario()
//Se permitido: usuário criado
//Se não: criação negada

//Etapa 2 – Pseudocódigo
//Verificar se quem está criando é ADMIN.
//Verificar se o novo usuário será PADRAO.
//Se as duas condições forem verdadeiras, criar.
//Caso contrário, negar.

//Etapa 3 – Código Java
enum TipoUsuario {
    ADMIN, PADRAO
}

class Usuario {
    String nome;
    TipoUsuario tipo;

    public Usuario(String nome, TipoUsuario tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}

public class Main {
    public static void criarUsuario(Usuario usuarioLogado, String nomeNovoUsuario, TipoUsuario tipoNovoUsuario) {
        if (usuarioLogado.tipo == TipoUsuario.ADMIN && tipoNovoUsuario == TipoUsuario.PADRAO) {
            Usuario novoUsuario = new Usuario(nomeNovoUsuario, tipoNovoUsuario);
            System.out.println("Usuário criado: " + novoUsuario.nome);
            System.out.println("Tipo: " + novoUsuario.tipo);
        } else {
            System.out.println("Criação negada. ADMIN só pode criar usuário PADRAO.");
        }
    }

    public static void main(String[] args) {
        Usuario admin = new Usuario("Administrador", TipoUsuario.ADMIN);

        criarUsuario(admin, "João", TipoUsuario.PADRAO);
        criarUsuario(admin, "Novo Admin", TipoUsuario.ADMIN);
    }
}