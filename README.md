Para rodar o programa:
`rmic -keep ConversorMoedas` - gera stubs para comunicação remota (se não rodar, tenta rmic -keep ConversorMoedas.java)

`java -Djava.security.policy=client.policy ClienteRMI` - roda o cliente com as configurações de segurança explicitadas em client.policy

`java -Djava.security.policy=server.policy ServidorRMI` - roda o servidor com as configurações de segurança explicitadas em server.policy

O programa deve agora estar disponível em rmi://localhost:1099/ConversorMoedas ou localhost:1099/ConversorMoedas