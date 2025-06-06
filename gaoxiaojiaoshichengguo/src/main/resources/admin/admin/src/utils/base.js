const base = {
    get() {
        return {
            url : "http://localhost:8080/gaoxiaojiaoshichengguo/",
            name: "gaoxiaojiaoshichengguo",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/gaoxiaojiaoshichengguo/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校教师成果管理"
        } 
    }
}
export default base
