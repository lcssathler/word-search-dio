# Document Indexing with Java

Este projeto demonstra como indexar documentos PDF com Java utilizando uma abordagem simples e com poucas dependências externas.

- Leitura de arquivos PDF utilizando Apache PDFBox
- Indexação simples de palavras por linha
- Busca textual por termos com retorno das linhas encontradas

## 🔧 Como executar o projeto

1. Clone o repositório e navegue até a pasta do projeto

2. Adicione um arquivo PDF em `data/documento.pdf`

3. Compile o projeto com Maven:
```bash
mvn compile
```

4. Execute o projeto:
```bash
mvn exec:java -Dexec.mainClass="com.dio.Main"
```

## 🤖 Tecnologias utilizadas
- Java 21
- Apache PDFBox
- Maven

## 📁 Estrutura do Projeto
```
document-indexing-java/
├── data/
│   └── documento.pdf
├── src/
│   └── main/java/com/dio/
│       ├── Ingestor.java
│       ├── Indexer.java
│       └── Main.java
├── pom.xml
└── README.md
```

## Resumo
Este projeto é um exemplo funcional de como criar uma base de indexação textual para documentos PDF usando Java. Ideal para quem quer aplicar conceitos de mineração de texto sem depender de grandes bibliotecas de IA.
