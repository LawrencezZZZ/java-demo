package com.demo.factory;

/**
 * 解决了简单工厂职责过重的问题，符合单一职责
 */
abstract class Factory {

   abstract Product createProduct();
}
