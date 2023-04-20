## 1) Contexto do projeto

O objetivo desse projeto é de criar um programa conversor de moedas (Real, Dólar e Euro) utilizando Java RMI, para uma atividade avaliativa da disciplina de Tópicos Especiais em Programação Distribuída. O projeto foi realizado com a versão 11.0.18 do OpenJDK.

## 2) Reproduzindo o Programa

Em um terminal, compilamos os arquivos em Java e rodamos o servidor:

```bash
javac *.java
java -Djava.security.policy=server.policy ServidorRMI
```

Em um outro terminal, uma vez que o servidor já está rodando, rodamos o cliente:

```bash
java -Djava.security.policy=client.policy ClienteRMI
```

Nota: não utilizamos comandos como rmic ou rmiregistry pois a chamada desses métodos já está explicitada em ServidorRMI.java

> `javac *.java` compila todos os códigos Java do projeto, criando arquivos correspondentes de extensão .class.

> `java -Djava.security.policy=server.policy ServidorRMI` - roda o servidor com as configurações de segurança explicitadas em server.policy

> `java -Djava.security.policy=client.policy ClienteRMI` - roda o cliente com as configurações de segurança explicitadas em client.policy