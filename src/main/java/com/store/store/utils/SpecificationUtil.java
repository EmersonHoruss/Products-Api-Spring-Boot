package com.store.store.utils;

import com.store.store.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class SpecificationUtil <E extends BaseEntity> implements Specification<E> {
    private String query;

    public void SpecificationUtil(String query){
        this.query = query;
    }

    @Override
    public Predicate toPredicate(Root<E> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        return null;
    }


    @Getter
    @Setter
    @AllArgsConstructor
    private static class Expression {
        private String field;
        private String operator;
        private List<?> values;
    }
}
