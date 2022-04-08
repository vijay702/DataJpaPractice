package com.eminds.Datajpapractice.entity;

import lombok.*;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column= @Column(name = "guardian_name")
        ),

        @AttributeOverride(
                name = "mobile", column = @Column(name = "guardian_mobile")
        )
})
public class Guardian {

    private String name;
    private String mobile;

}
