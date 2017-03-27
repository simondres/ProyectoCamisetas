package arqSw.Hibernate;
// Generated 20/03/2017 08:42:47 PM by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;

/**
 * Estampa generated by hbm2java
 */
public class Estampa implements java.io.Serializable {

    private Integer idEstampa;
    private Tema tema;
    private Artista artista;
    private String nombre;
    private String descripcion;
    private String imagenes;
    private String rating;
    private String popularidad;
    private Set<Estampasventas> estampasventases = new HashSet<Estampasventas>(0);

    public Estampa() {
    }

    public Estampa(Tema tema, Artista artista) {
        this.tema = tema;
        this.artista = artista;
    }

    public Estampa(Tema tema, Artista artista, String nombre, String descripcion, String imagenes, String rating, String popularidad, Set<Estampasventas> estampasventases) {
        this.idEstampa = 0;
        this.tema = tema;
        this.artista = artista;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenes = imagenes;

        this.rating = rating;
        this.popularidad = popularidad;
        this.estampasventases = estampasventases;
    }

    public int getIdEstampa() {
        return this.idEstampa;
    }

    public void setIdEstampa(Integer idEstampa) {
        this.idEstampa = idEstampa;
    }

    public Tema getTema() {
        return this.tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Artista getArtista() {
        return this.artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenes() {
        return this.imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPopularidad() {
        return this.popularidad;
    }

    public void setPopularidad(String popularidad) {
        this.popularidad = popularidad;
    }

    public Set<Estampasventas> getEstampasventases() {
        return this.estampasventases;
    }

    public void setEstampasventases(Set<Estampasventas> estampasventases) {
        this.estampasventases = estampasventases;
    }

}
