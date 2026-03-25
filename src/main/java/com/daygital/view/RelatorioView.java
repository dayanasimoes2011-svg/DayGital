package com.daygital.view;

import com.daygital.model.BaseEntity;

import java.util.List;

public class RelatorioView {

    public void exibirCabecalho() {
        System.out.println("========================================");
        System.out.println("          DAYGITAL - Sistema MVC        ");
        System.out.println("========================================");
        System.out.println();
    }

    public void exibirRelatorio(List<BaseEntity> entities) {
        System.out.println(">> Relatorio de Entidades:");
        System.out.println("------------------------------------------");
        for (BaseEntity entity : entities) {
            System.out.println("  ID       : " + entity.getId());
            System.out.println("  Criado em: " + entity.getCreatedAt());
            System.out.println("  Atualizado: " + entity.getUpdatedAt());
            System.out.println("------------------------------------------");
        }
        System.out.println("Total de registros: " + entities.size());
        System.out.println();
    }

    public void exibirRodape() {
        System.out.println("========================================");
        System.out.println("  Auditoria concluida com sucesso.      ");
        System.out.println("========================================");
    }
}
