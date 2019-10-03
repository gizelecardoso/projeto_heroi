# projeto_heroi
      
ESTRUTURA: Spring Boot

Banco usado: MYSQL

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



 
 
