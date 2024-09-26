package com.dafaak.spring.examples.a2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MongoDbDataService implements DataService {
    @Override
    public int[] retrieveDAta() {
        return new int[]{11, 22, 33, 44, 55};
    }
}
