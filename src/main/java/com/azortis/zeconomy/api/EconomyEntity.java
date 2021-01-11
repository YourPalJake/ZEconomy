/*
 * MIT License
 *
 * Copyright (c) 2021 Azortis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.azortis.zeconomy.api;

import com.azortis.zeconomy.api.bank.Bank;
import com.azortis.zeconomy.api.bank.Currency;

import java.util.UUID;

/**
 * Represents an entity that interacts in the economy,
 * every type must be registered in {@link EconomyProvider}
 *
 * @param <T> The type of entity being represented.
 */
public interface EconomyEntity<T> {

    /**
     * Universally unique economy identifier.
     * For instance {@link org.bukkit.entity.Player} should return the player's unique id.
     *
     * @return A universally
     */
    UUID getEconomyId();

    /**
     * Get the entity which is being represented.
     *
     * @return Entity being represented.
     */
    T getEntity();

    Bank getPrimaryBank();

    Bank getPrimaryBank(Currency currency);

    Bank[] getBanks();

    Bank[] getBanksByCurrency(Currency currency);

    Bank[] getMemberBanks();

    Bank[] getMemberBanksByCurrency(Currency currency);

}