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
public class UpdateSubjectPayloadQuery extends Query<UpdateSubjectPayloadQuery> {
    UpdateSubjectPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class SubjectArguments extends Arguments {
        SubjectArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SubjectArguments filter(SubjectFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SubjectArguments order(SubjectOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SubjectArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SubjectArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SubjectArgumentsDefinition {
        void define(SubjectArguments args);
    }

    /**
    * 
    */
    public UpdateSubjectPayloadQuery subject(SubjectQueryDefinition queryDef) {
        return subject(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateSubjectPayloadQuery subject(SubjectArgumentsDefinition argsDef, SubjectQueryDefinition queryDef) {
        startField("subject");

        SubjectArguments args = new SubjectArguments(_queryBuilder);
        argsDef.define(args);
        SubjectArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubjectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
