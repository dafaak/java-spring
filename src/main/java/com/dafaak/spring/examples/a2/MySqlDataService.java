package com.dafaak.spring.examples.a2;

import org.springframework.stereotype.Repository;

@Repository
public class MySqlDataService implements DataService {
    @Override
    public int[] retrieveDAta() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
