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
public class UpdateFestivalFocusPayloadQuery extends Query<UpdateFestivalFocusPayloadQuery> {
    UpdateFestivalFocusPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class FestivalfocusArguments extends Arguments {
        FestivalfocusArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FestivalfocusArguments filter(FestivalFocusFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalfocusArguments order(FestivalFocusOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalfocusArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FestivalfocusArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FestivalfocusArgumentsDefinition {
        void define(FestivalfocusArguments args);
    }

    /**
    * 
    */
    public UpdateFestivalFocusPayloadQuery festivalfocus(FestivalFocusQueryDefinition queryDef) {
        return festivalfocus(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateFestivalFocusPayloadQuery festivalfocus(FestivalfocusArgumentsDefinition argsDef, FestivalFocusQueryDefinition queryDef) {
        startField("festivalfocus");

        FestivalfocusArguments args = new FestivalfocusArguments(_queryBuilder);
        argsDef.define(args);
        FestivalfocusArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FestivalFocusQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
