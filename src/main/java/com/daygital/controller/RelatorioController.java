package com.daygital.controller;

import com.daygital.model.BaseEntity;
import com.daygital.view.RelatorioView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RelatorioController {

    private final RelatorioView view;
    private final List<BaseEntity> entities;

    public RelatorioController() {
        this.view = new RelatorioView();
        this.entities = new ArrayList<>();
    }

    public void run() {
        view.exibirCabecalho();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String now = LocalDateTime.now().format(formatter);

        BaseEntity entity1 = new BaseEntity();
        entity1.setId(1L);
        entity1.setCreatedAt(now);
        entity1.setUpdatedAt(now);
        entities.add(entity1);

        BaseEntity entity2 = new BaseEntity();
        entity2.setId(2L);
        entity2.setCreatedAt(now);
        entity2.setUpdatedAt(now);
        entities.add(entity2);

        view.exibirRelatorio(entities);
        view.exibirRodape();
    }

    public static void main(String[] args) {
        RelatorioController controller = new RelatorioController();
        controller.run();
    }
}
