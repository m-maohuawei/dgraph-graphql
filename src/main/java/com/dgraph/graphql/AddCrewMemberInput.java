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

public class AddCrewMemberInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<List<FilmRef>> filmsCrewed = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public AddCrewMemberInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public AddCrewMemberInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<FilmRef> getFilmsCrewed() {
        return filmsCrewed.getValue();
    }

    public Input<List<FilmRef>> getFilmsCrewedInput() {
        return filmsCrewed;
    }

    public AddCrewMemberInput setFilmsCrewed(List<FilmRef> filmsCrewed) {
        this.filmsCrewed = Input.optional(filmsCrewed);
        return this;
    }

    public AddCrewMemberInput setFilmsCrewedInput(Input<List<FilmRef>> filmsCrewed) {
        if (filmsCrewed == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.filmsCrewed = filmsCrewed;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.filmsCrewed.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("films_crewed:");
            if (filmsCrewed.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FilmRef item1 : filmsCrewed.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}