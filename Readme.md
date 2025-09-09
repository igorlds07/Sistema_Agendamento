# 📅 Sistema de Agendamento de Serviços

## 📖 Sobre o projeto
Este projeto tem como objetivo desenvolver um **sistema de agendamento e gestão de ordens de serviço**, aplicando conceitos de **Spring Boot**, **padrão MVC** e boas práticas de desenvolvimento.  
A aplicação permitirá cadastrar clientes, técnicos, serviços, realizar agendamentos e gerar ordens de serviço com checklist, anexos e assinaturas.

---

## 🚀 Tecnologias utilizadas
- Java 17+
- Spring Boot 3 (Web, Data JPA, Validation)
- Hibernate / JPA
- Banco de dados H2 (dev) e PostgreSQL (prod)
- Maven
- Lombok (para reduzir boilerplate)
- Git/GitHub para versionamento

---

## 📂 Estrutura do projeto
- `entity/` → Entidades JPA (Cliente, Técnico, Serviço, Agendamento, Ordem de Serviço, Checklist…)  
- `repository/` → Interfaces JPA para persistência  
- `service/` → Regras de negócio (validações de conflito, transições de status etc.)  
- `controller/` → Camada web (REST e MVC/Thymeleaf)  
- `resources/` → `application.properties` e scripts de inicialização  

---

## ⚙️ Funcionalidades previstas
- Cadastro de clientes e técnicos  
- Cadastro de serviços com preço e duração padrão  
- Agendamento de serviços (cliente + técnico + data/hora)  
- Validação de conflitos de agenda  
- Geração de ordem de serviço a partir de um agendamento confirmado  
- Checklist associado à ordem de serviço  
- Status da OS (`ABERTA → EM_EXECUÇÃO → CONCLUÍDA / CANCELADA`)  
- Relatórios simples (em construção)

---

## ▶️ Como executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/sistema-agendamento.git
Entre no diretório do projeto:

bash
Copiar código
cd sistema-agendamento
Compile e rode com Maven:

bash
Copiar código
mvn spring-boot:run
Acesse a aplicação em:

arduino
Copiar código
http://localhost:8080
📌 Status do projeto
🚧 Em desenvolvimento 🚧
Atualmente implementando as entidades e relacionamentos principais.
