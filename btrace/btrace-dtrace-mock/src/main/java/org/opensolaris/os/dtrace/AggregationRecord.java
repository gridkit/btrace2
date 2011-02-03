/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 *
 * You can obtain a copy of the license at usr/src/OPENSOLARIS.LICENSE
 * or http://www.opensolaris.org/os/licensing.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at usr/src/OPENSOLARIS.LICENSE.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

/*
 * Copyright 2008 Sun Microsystems, Inc.  All rights reserved.
 * Use is subject to license terms.
 *
 * ident	"%Z%%M%	%I%	%E% SMI"
 */
package org.opensolaris.os.dtrace;

import java.util.*;
import java.io.*;
import java.beans.*;

/**
 * A single key-value pair in a DTrace aggregation.
 * <p>
 * Immutable.  Supports persistence using {@link java.beans.XMLEncoder}.
 *
 * @see Aggregation
 * @author Tom Erickson
 */
public final class AggregationRecord implements Record, Serializable {
    static final long serialVersionUID = -4367614268579702616L;

    /**
     * Creates an aggregation record with the given key and value.
     * Supports XML persistence.
     *
     * @see #AggregationRecord(Tuple tupleKey, AggregationValue
     * recordValue, int n)
     */
    public
    AggregationRecord(Tuple tupleKey, AggregationValue recordValue)
    {
    }

    /**
     * Creates an aggregation record with the given key, value, and
     * ordinal. Supports XML persistence.
     *
     * @param tupleKey aggregation tuple, may be empty (see {@link
     * Tuple#EMPTY}) to indicate that this record's value belongs to an
     * unkeyed aggregation declared without square brackets, for
     * example: <pre>		{@code @a = count();}</pre>
     * @param recordValue aggregated value associated with the given
     * tuple
     * @param n ordinal from zero (first) to n-1 (last) within the
     * {@link Aggregate} containing this record
     * @throws NullPointerException if the given key or value is
     * {@code null}
     * @throws IllegalArgumentException if the given ordinal is negative
     */
    public
    AggregationRecord(Tuple tupleKey, AggregationValue recordValue, int n)
    {
    }

    /**
     * Gets the multi-element key associated with {@link
     * #getValue()}.
     *
     * @return non-null, possibly empty tuple
     * @see Aggregation#getRecord(Tuple key)
     */
    public Tuple
    getTuple()
    {
	return null;
    }

    /**
     * Gets the value associated with {@link #getTuple()}.  Values
     * generated by the DTrace actions {@code count()}, {@code sum()},
     * {@code avg()}, {@code min()}, and {@code max()} are of type
     * {@link Long}.  Values generated by the DTrace actions {@code
     * quantize(}) and {@code lquantize()} are of type {@link
     * Distribution}.
     *
     * @return non-null value keyed to {@link #getTuple()}
     */
    public AggregationValue
    getValue()
    {
	return null;
    }

    /**
     * Gets the ordinal generated when this AggregationRecord was added
     * to its containing {@link Aggregate} by the native DTrace library,
     * from zero (first) to n-1 (last). The sequence described by an
     * aggregate's record ordinals reflects the setting of the {@link
     * Option#aggsortkey aggsortkey}, {@link Option#aggsortkeypos
     * aggsortkeypos}, {@link Option#aggsortpos aggsortpos}, and {@link
     * Option#aggsortrev aggsortrev} DTrace options and matches the way
     * that the records would be ordered by {@code dtrace(1M)}.
     *
     * @return non-negative ordinal from zero (first) to n-1 (last)
     * within the {@code Aggregate} containing this record
     * @see Aggregate#getOrderedRecords()
     */
    public int
    getOrdinal()
    {
	return -1;
    }
}