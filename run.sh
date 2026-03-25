#!/bin/bash
mkdir -p out
javac -d out src/main/java/com/daygital/model/BaseEntity.java src/main/java/com/daygital/view/RelatorioView.java src/main/java/com/daygital/controller/RelatorioController.java
java -cp out com.daygital.controller.RelatorioController
