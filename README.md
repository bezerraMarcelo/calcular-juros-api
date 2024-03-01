
# Calcula Juros API

Uma API simples para calcular juros compostos de um parcelamento. Recebe uma json com os paramentos valor principal, quantidade parcelas e o percentual de juros.




## Documentação da API

### Descrição
Calcula o valor das parcelas com base nos parâmetros fornecidos.

### Parâmetros de entrada

```html
value (number): O valor total a ser financiado.
interestPercentage (number): A taxa de juros.
numberInstallments (number): O número de parcelas desejado.
```
Exemplo do corpo do JSON de entrada:
```json
{    
"value": 1000,
"interestPercentage": 1.2,
"numberInstallments": 12
}
```

#### Retorna todos os itens

```http
  GET /calcular
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `Parameter` | `JSON` | **Obrigatório**. JSON no corpo da requisição |

#### Retorna um item contendo os valores calculados.

Exemplo do JSON de retorno:
```json
{
    "installmentValue": 89.98,
    "amount": 1079.71,
    "totalInterest": 79.71
}   
```




## Stack utilizada

**Back-end:** Java 17, Spring Boot


## Implementado testes unitarios

A classe CalculateInterestServiceTests é responvel por testar a service CalculateInterestService



