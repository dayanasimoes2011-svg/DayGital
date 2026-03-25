# 🌐 DAYGITAL - Auditoria & Compliance

## 📌 Objetivo
Sistema acadêmico desenvolvido em JAVA para monitoramento de registros e auditoria de integridade de dados, utilizando o padrão de projeto MVC.

## 🛠 Tecnologias e Arquitetura
- ☕ Java  
- 🖥️ MVC  
- 🤖 Ambiente configurado para execução rápida via Replit (inclui run.sh).

## 🚀 Funcionalidades de Auditoria
- ✅ Rastreabilidade: Registro automático de data de criação (creatATt) e última atualização (updatedAt).
- ✅ Compliance: Verificação de integridade temporal (validação de cronologia de logs)
- ✅ Motor de Relatórios: Geração de sumário de registros processados diretamente no console.

## 📂 Estrutura do Projeto
DAYGITAL/
├── src/
│    ├── model/       #Entidades e 
regras de negócio (BaseEntity)
│    ├── controller/  # Lógica de
controle de fluxo de dados
│    └── view/        # Interface de
saída ( Console)
├── rush.sh           # Script de
automação
└── README.md         # Documentação

## ▶️ Como executar no replit
1. Certifique-se de que os arquivos estão na pasta src.
2. No console do Replit, digite:
   ```bash
   chmod +x run.sh
   ./run.sh
   ```
Compile os arquivos:

```bash
javac src/*.java
```
Execute:

```bash
java RelatorioController
```
O sistema utiliza a classe BaseEntity para garantir a padronização dos logs de auditoria com carimbos de tempos precisos, identificando riscos de fraude cronológica, validando se o tempo de atualização de um registro é coerente coma a realidade (Compliance Temporal).
