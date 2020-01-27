### JPA / Hibernate Annotations
- @Table : @Table(name="<name of table">) : Map the Entity once 
- @Column : @Column(name=<name of column>, options)
```java
@Entity
@Table(name = "customer")
class Customer {
    
    @Id
    @GeneratedValue()
    Long id;
    
    @Column(name="name", nullable=false)
    String name;

    public Long getId() { 
        return id;
    }
    
    public void setId(Long id) { 
        this.id = id; 
    }
    public String getName() {
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
}
```

- @UpdateTimeStamp - hibernate will manage
- @CreationTimeStamp - hibernate will manage

```java
    @UpdateTimeStamp
    private LocalDateTime lastUpdatedDate;

    @CreationTimestamp
    private LocalDateTime craetedDate;
```

- @NamedQuery - provide a way to name a query in hibernate
- @NamedQueries - provide a way to name queries in hibernate

```java
@NamedQueries({
	@NamedQuery(
	name = "findStockByStockCode",
	query = "from Stock s where s.stockCode = :stockCode"
	)
})
@Entity
@Table(name = "stock", catalog = "pankaj")
public class Stock implements java.io.Serializable {
    .....
}

// Calling the named query
Query query = session.getNamedQuery("findStockByStockCode")
.setString("stockCode", "7277");
```