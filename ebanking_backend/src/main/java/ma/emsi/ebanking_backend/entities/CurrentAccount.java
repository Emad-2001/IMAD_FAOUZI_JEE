package ma.emsi.ebanking_backend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@DiscriminatorValue("CA")
public class CurrentAccount extends  BankAccount{
    private  double overDraft;
}
