class C : A, B{
    override fun callMe() {
        super<A>.callMe()
        super<B>.callMe()
    }



}
