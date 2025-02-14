# 📌 InteliTransfer

O sistema de agendamento de transferências é estruturado de forma a seguir os princípios de uma aplicação Spring Boot, com uma separação clara de responsabilidades entre camadas, como Controller, Service e Repository.

---

## 🛠 Tecnologias Utilizadas

- 🚀 **Java 11**
- ⚙️ **Spring Boot**
- 🏗 **Maven**
- 💾 **JPA / Hibernate**
- 🗄 **Banco de Dados: H2 (em memória)**
- ✨ **Lombok**
- 🌍 **Tomcat 9**

---

## Pré-requisitos

Antes de começar, certifique-se de que você tenha as seguintes ferramentas instaladas:

- **Java 11** ou superior
- **Maven** (para gerenciamento de dependências e build)
- **IDE** (como IntelliJ IDEA, Eclipse, VSCode, etc.)

### 1️⃣ Clonar o repositório:

```bash
git clone https://github.com/yMendyllKDll/InteliTransfer.git
```

## 📌 Endpoints

### 📖 Listar todos os agendamentos

- **Método:** `GET`
- **Endpoint:** `/v1/transferencia`
- **Retorno:** Lista de transferências agendadas.

#### Exemplo de resposta:

```json
[
  {
    "id": 1,
    "contaOrigem": "1234567",
    "contaDestino": "9876543",
    "valor": 62.0,
    "valorTaxa": 12.0,
    "taxa": 0.0,
    "dtAgendamento": "12/02/2025 10:00:00",
    "dtTransferencia": "13/03/2025 10:30:00"
  }
]
```
### ✍️ Criar um novo agendamento

- **Método:** `POST`
- **Endpoint:** `/v1/transferencia`
- **Body (JSON):**

```json
{
    "contaOrigem":"782534-99",
    "contaDestino":"231565-02",
    "valor":"12.00",
    "dataTransferencia":"2025-02-21 18:50"
}
```
##Retorno: Agendamento cadastrado com sucesso.
