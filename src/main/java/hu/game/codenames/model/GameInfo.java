package hu.game.codenames.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class GameInfo extends AuditableEntity<String>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lang;
    private String matrix;
    private String func;
    private int clueNum;
    private int passNum;
    private int greenCardNum;
    private int greyCardNum;
    private boolean win;
    private int score;
    private LocalDateTime start;


}
