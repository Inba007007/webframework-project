package com.login.login.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Attendance {
    @Id
    public int id;
    public String date;
    public String Present;

    @OneToMany(mappedBy="attendance",cascade = CascadeType.ALL)
    private List<PF> pf;

}
