// Generated from graphql_java_gen gem

package com.dgraph.graphql;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* 
*/
public class DistributorQuery extends Query<DistributorQuery> {
    DistributorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * 
    */
    public DistributorQuery id() {
        startField("id");

        return this;
    }

    /**
    * 
    */
    public DistributorQuery name() {
        startField("name");

        return this;
    }

    public class FilmsDistributedArguments extends Arguments {
        FilmsDistributedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FilmsDistributedArguments filter(FilmFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FilmsDistributedArguments order(FilmOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FilmsDistributedArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FilmsDistributedArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FilmsDistributedArgumentsDefinition {
        void define(FilmsDistributedArguments args);
    }

    /**
    * 
    */
    public DistributorQuery filmsDistributed(FilmQueryDefinition queryDef) {
        return filmsDistributed(args -> {}, queryDef);
    }

    /**
    * 
    */
    public DistributorQuery filmsDistributed(FilmsDistributedArgumentsDefinition argsDef, FilmQueryDefinition queryDef) {
        startField("films_distributed");

        FilmsDistributedArguments args = new FilmsDistributedArguments(_queryBuilder);
        argsDef.define(args);
        FilmsDistributedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FilmQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
