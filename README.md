# Day33-DP-Part1

● 理论基础 

● 509. 斐波那契数 

当前数字等于前两位数字之和。

● 70. 爬楼梯 

跟斐波那契一样。

● 746. 使用最小花费爬楼梯 

可以从第一阶或者第二阶开始，所以设置dp0 dp1为前两阶。然后更新dp1为两者最小值加上当前cost。最后return dp0和dp1的最小值因为，从倒数第二阶梯也能到终点。
