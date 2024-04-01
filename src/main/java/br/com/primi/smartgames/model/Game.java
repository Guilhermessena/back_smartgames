package br.com.primi.smartgames.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_jogo")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nome_jogo")
    private String name;
    @Column(name = "descricao")
    private String description;
    @Column(name = "link_imagem")
    private String linkImage;
    @Column(name = "preco")
    private String price;
    @Column(name = "plataformas")
    private String platforms;
    @Column(name = "lojas")
    private String store;

    public Game() {

    }

    public Game(int id, String name, String description, String linkImage, String price, String platforms, String store) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.linkImage = linkImage;
        this.price = price;
        this.platforms = platforms;
        this.store = store;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
