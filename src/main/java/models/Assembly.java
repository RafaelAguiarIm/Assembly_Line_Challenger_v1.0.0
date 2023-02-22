package models;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

@Table(name = "assemblys")
@Entity(name = "Assembly")
public class Assembly {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String time;
    private LocalTime initialHours;
    @ManyToOne
    @JoinColumn(name = "linha_montagem_id")
    private LinhasDeMontagens linhasDeMontagens;

    public LinhasDeMontagens getLinhasDeMontagens() {
        return linhasDeMontagens;
    }

    public void setLinhasDeMontagens(LinhasDeMontagens linhasDeMontagens) {
        this.linhasDeMontagens = linhasDeMontagens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

       public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public LocalTime getInitialHours() {
        return initialHours;
    }

    public void setInitialHours(LocalTime initialHours) {
        this.initialHours = initialHours;
    }

    @Override
    public String toString() {
        return "Assembly{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", time='" + time + '\'' +
                ", initialHours=" + initialHours +
                ", linhasDeMontagens=" + linhasDeMontagens.getId() +
                '}';
    }
}
