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

public class AddOwnershipInput implements Serializable {
    private String name;

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<ThingRef> owned = Input.undefined();

    private Input<DateTime> dateFrom = Input.undefined();

    private Input<DateTime> dateThrough = Input.undefined();

    public AddOwnershipInput(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public AddOwnershipInput setName(String name) {
        this.name = name;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public AddOwnershipInput setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public AddOwnershipInput setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
        if (namespaces == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.namespaces = namespaces;
        return this;
    }

    public String getIdentifier() {
        return identifier.getValue();
    }

    public Input<String> getIdentifierInput() {
        return identifier;
    }

    public AddOwnershipInput setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public AddOwnershipInput setIdentifierInput(Input<String> identifier) {
        if (identifier == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.identifier = identifier;
        return this;
    }

    public String getAlternateName() {
        return alternateName.getValue();
    }

    public Input<String> getAlternateNameInput() {
        return alternateName;
    }

    public AddOwnershipInput setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public AddOwnershipInput setAlternateNameInput(Input<String> alternateName) {
        if (alternateName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alternateName = alternateName;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public AddOwnershipInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public AddOwnershipInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public ThingRef getOwned() {
        return owned.getValue();
    }

    public Input<ThingRef> getOwnedInput() {
        return owned;
    }

    public AddOwnershipInput setOwned(ThingRef owned) {
        this.owned = Input.optional(owned);
        return this;
    }

    public AddOwnershipInput setOwnedInput(Input<ThingRef> owned) {
        if (owned == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.owned = owned;
        return this;
    }

    public DateTime getDateFrom() {
        return dateFrom.getValue();
    }

    public Input<DateTime> getDateFromInput() {
        return dateFrom;
    }

    public AddOwnershipInput setDateFrom(DateTime dateFrom) {
        this.dateFrom = Input.optional(dateFrom);
        return this;
    }

    public AddOwnershipInput setDateFromInput(Input<DateTime> dateFrom) {
        if (dateFrom == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateFrom = dateFrom;
        return this;
    }

    public DateTime getDateThrough() {
        return dateThrough.getValue();
    }

    public Input<DateTime> getDateThroughInput() {
        return dateThrough;
    }

    public AddOwnershipInput setDateThrough(DateTime dateThrough) {
        this.dateThrough = Input.optional(dateThrough);
        return this;
    }

    public AddOwnershipInput setDateThroughInput(Input<DateTime> dateThrough) {
        if (dateThrough == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateThrough = dateThrough;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        if (this.namespaces.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("namespaces:");
            if (namespaces.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (NamespaceRef item1 : namespaces.getValue()) {
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

        if (this.identifier.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("identifier:");
            if (identifier.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, identifier.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.alternateName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("alternateName:");
            if (alternateName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, alternateName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.owned.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("owned:");
            if (owned.getValue() != null) {
                owned.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateFrom.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateFrom:");
            if (dateFrom.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, dateFrom.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateThrough.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateThrough:");
            if (dateThrough.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, dateThrough.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
