package com.electronwill.utils;

import java.util.Collection;

/**
 * A resizeable collection based on an array. The delete operation is in constant time because it
 * just moves the last element to fill the gap.
 *
 * @author TheElectronWill
 */
public interface Bag<E> extends Collection<E> {
	/**
	 * @param index the element's index.
	 * @return the element at the specified index.
	 *
	 * @throws ArrayIndexOutOfBoundsException if the specified index is negative or greater than
	 *                                        the size of the bag.
	 */
	E get(int index);

	/**
	 * @param index the element's index.
	 * @return the element at the specified index, or null if the index is negative or greater than
	 * the size of the bag.
	 */
	E tryGet(int index);

	/**
	 * Removes the element at the specified index, and moves the last element to this index to "fill
	 * the gap".
	 *
	 * @param index the element's index.
	 */
	void remove(int index);

	/**
	 * Trims the capacity of this Bag instance to be the bag's current size. Use this operation to
	 * minimize the storage of an Bag instance.
	 */
	void trimToSize();
}