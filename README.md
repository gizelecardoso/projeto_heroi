# projeto_heroi
      
ESTRUTURA: Spring Boot

BANCO DE DADOS: MYSQL

ARQUITETURA: MVC

PROJETO:

  2 CRUDS
  
  CRUD - Heroi
  CRUD - Poder
 
 Heroi tem um atributo chamado parceiro, que pode ser outro Heroi.
 
        public class SuperHeroi

        String nome
        String universo 
        xxxxx  parceiro
        Lista de Poderes


        public class Poderes
        String  poder;
        Integer forca;


Teste pela API mesmo, sem trabalhar com a VIEW.


Trabalhando com relacionamento @OneToOne - para referenciar o parceiro (Heroi)

Trabalhando com relacionamento @ManyToMany - para referencia Lista de Heroi para Poder, e de Poder para Heroi 
          - criando no banco tabela associativa através @JoinTable (@JoinColumn com joinColumns e inverseJoinColumns)
          


*Rodando Aplicação
      - Na classe HeroiController e PoderesController:
                  RUN - NEW_CONFIGURATION;


*Acessando Banco de Dados Mysql pelo Docker:

      - Criando acesso ao Banco de Dados:
            docker run -p 3306:3306 --name banco_super -e MYSQL_ROOT_PASSWORD=senha -d mysql
            
            -p: especifica a porta container:local
            --name: nome do container (nesse caso coloquei o mesmo nome do meu banco)
            -e: especificação do usuario e senha
            -d: iniciar o container em backgound
            mysql: nome imagem utilizada
            
       - acessando o container:
            docker exe -it numero_do_container bash;
            
            
       - acessando o banco mysql:     
            mysql -uroot -p;
                  password
            create database banco_super;
                  //o banco precisa ser criado, o JPA não faz, ele só cria as tabelas.
            use banco_super;




 
 
