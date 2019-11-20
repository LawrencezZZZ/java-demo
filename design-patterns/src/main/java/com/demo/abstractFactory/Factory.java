package com.demo.abstractFactory;

/**
 * 工厂模式一个工厂只生产一种产品，产品越多工厂越多
 * 抽象工厂模式一个工厂统一生产一个产品族
 * eg: 两套皮肤，红色，黑色。。。有圆的有长方形的图形
 *  但是增加一个方形。。就不符合开闭原则了
 */
abstract class Factory {

   abstract ProductCycle createProductCycle();

   abstract ProductRectangle createProductRectangle();

}
