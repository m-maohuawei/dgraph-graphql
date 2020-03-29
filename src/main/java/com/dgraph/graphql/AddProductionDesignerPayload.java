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
public class AddProductionDesignerPayload extends AbstractResponse<AddProductionDesignerPayload> {
    public AddProductionDesignerPayload() {
    }

    public AddProductionDesignerPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "productiondesigner": {
                    List<ProductionDesigner> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ProductionDesigner> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ProductionDesigner optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ProductionDesigner(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "AddProductionDesignerPayload";
    }

    /**
    * 
    */

    public List<ProductionDesigner> getProductiondesigner() {
        return (List<ProductionDesigner>) get("productiondesigner");
    }

    public AddProductionDesignerPayload setProductiondesigner(List<ProductionDesigner> arg) {
        optimisticData.put(getKey("productiondesigner"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "productiondesigner": return true;

            default: return false;
        }
    }
}

