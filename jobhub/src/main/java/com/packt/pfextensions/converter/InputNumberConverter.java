package com.packt.pfextensions.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.packt.pfextensions.model.Currency;


@FacesConverter("inputNumberConverter")
public class InputNumberConverter implements Converter {

        public Object getAsObject(FacesContext context, UIComponent component, String value) {
                Double doubleValue = 0.0;
                if (value != null && !value.isEmpty()) {
                        doubleValue = Double.valueOf(value);
                }

                Currency res = new Currency();
                res.setDollars(doubleValue);

                return res;
        }

        public String getAsString(FacesContext context, UIComponent component, Object value) {
                Currency Currency = (Currency) value;
                Double res = Currency.getDollars();

                return res.toString();
        }
}