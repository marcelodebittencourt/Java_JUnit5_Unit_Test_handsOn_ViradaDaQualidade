![](https://github.com/marcelodebittencourt/handsOn_JUnit5_ViradaDaQualidade/workflows/tests/badge.svg)

# Hands-on de JUnit 5  
Este código foi gerado ao longo do hands-on que foi realizado ao vivo no evento Virada da Qualidade. O vídeo original está disponível no link https://www.youtube.com/watch?v=pdEJNU8rUto&t=21391s no ponto de 05h56min.

## Pré-requisitos
* [Java 11 SDK](https://www.oracle.com/java/technologies/downloads/#java11)
* [Maven](https://maven.apache.org/download.cgi) >= 3.8.3 
* [Git](https://git-scm.com/) >= 2.33.0 
* [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download) >= 2021.2 

## O que está contido neste repositório
* Software-alvo dos testes é parte de um sistema de conta-corrente bancária que contém as classes abaixo disponível nas pasta src > java > principal:
  * Cliente: cliente que tem um nome
  * Conta: Cada cliente pode ter uma ou mais contas, que terão agência, número de conta e saldo inicial
  * Lancamento: Cada conta poderá ter zero ou mais lançamentos compostos por tipo de lançamento (D para Débito ou C para Crédito), data, valor e histórico.
* Testes que contemplam as 3 classes listadas acima. Os testes estão disponíveis na pasta "src" > "test" > "java" > "tests"
* Arquivo de massa de dados "nomes.csv" disponível em "src" > "test" > "java" > "resources" para execução de teste parametrizado

# O que é exercitado de JUnit 5
* Anotações: 
  * @Test: marca o método como teste do JUnit
  * @BeforeAll: marca o método para ser executado uma única vez antes do ínicio da execução dos testes da classe de teste
  * @BeforeEach: marca o método para ser executado antes da execução de cada teste da classe de teste
  * @AfterAll: marca o método para ser executado uma única vez depois do fim da execução dos testes da classe de teste
  * @AfterEach: marca o método para ser executado depois da execução de cada teste da classe de teste
  * @DisplayName: define um nome amigável para o teste
  * @ParameterizedTest: define que o método é um teste com parâmetros, no caso deste código utiliza como parâmetro a massa de dados do arquivo CSV
* Asserções do JUnit e do AssertJ que validam os resultados do teste. 

## Como importar o projeto no IntelliJ IDEA
1. Clone este projeto em uma pasta em sua máquina local com o comando abaixo no CMD (Prompt de comando):
   
   git clone https://github.com/marcelodebittencourt/handsOn_JUnit5_ViradaDaQualidade.git

2. Será criada a subpasta "handsOn_JUnit5_ViradaDaQualidade" a partir de sua pasta onde você rodou este comando. O projeto estará salvo nesta subpasta.
3. Abra a IDE IntelliJ IDEA
4. Se algum projeto abrir automaticamente, vá em "File" > "Close Project"   
5. Na tela principal do IntelliJ IDEA, clique no botão "Open"
6. Navegue até a subpasta que contém o projeto que foi clonado
7. Clique no botão "OK"
8. O projeto será importado e aberto com sucesso no IntelliJ IDEA
9. Atualize as dependências localmente clicando com o botão direito no nome do projeto logo acima da lista de pastas e arquivos do projeto
10. No menu que aparece, selecione a opção "Maven" > "Reload Project". Role o menu para baixo caso necessário até aparecer a opção "Maven"
11. Aguarde por cerca de 1 minuto até que as dependências sejam baixadas localmente. 

## Como rodar os testes no IntelliJ IDEA
1. Expanda o projeto, clicando no ícone ">" logo ao lado esquerdo projeto nome do projeto na guia Project
2. Expanda até que se possível visualizar a estrutura "src" > "test" > "java"
3. Para rodar todos os testes, clique com o botão direito no pacote "tests"
4. No menu de contexto que aparece, selecione a opção "Run 'Tests' in 'tests'"
5. Os resultados aparecerão na parte inferior da IDE
6. Se quiser rodar os testes para cada classe, basta repetir os passos 3 a 5, mas clicando em cada classe de teste dentro do pacote tests.

## Como rodar os testes via linha de comando
1. Abra o CMD (Prompt de comando)
2. Acesse a pasta onde encontra-se o projeto:

   cd\\{LOCAL_DA_PASTA}
3. Rode o comando:

   mvn clean test
   
## Como gerar e visualizar relatórios de execução de teste via linha de comando
1. Abra o CMD (Prompt de comando)
2. Acesse a pasta onde encontra-se o projeto:
   
   cd\\{LOCAL_DA_PASTA}
3. Rode o comando:
   
   mvn surefire-report:report
4. Volte para o IntelliJ IDEA
5. Expanda o projeto até que apareça a pasta "target" > "site"
6. Clique com o botão direito no arquivo "surefire-report.html"
7. No menu de contexto que aparece selecione "Open In" > "Browser" > "Chrome".

## Contato do autor
https://marcelodebittencourt.com

## CI/CD suportados:
* [GitHub Action](https://github.com/marcelodebittencourt/Java_JUnit5_Unit_Test_handsOn_ViradaDaQualidade/blob/master/.github/workflows/test.yml): quando um push é realizado neste repositório do GitHub, os testes são automaticamente executados. 
* [Jenkins](https://github.com/marcelodebittencourt/Java_JUnit5_Unit_Test_handsOn_ViradaDaQualidade/blob/master/pipeline_as_code/Jenkinsfile): previamente configure na instância do Jenkins o apontamento para o Java JDK 11 e para o Maven coloque o nome de "M3".   