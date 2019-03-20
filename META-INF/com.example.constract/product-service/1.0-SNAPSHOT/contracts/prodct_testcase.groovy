import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            description "get prodct name"
            request {
                url "/getProductName?id=2"
                method GET()
            }
            response {
                status 200
                headers{
                    header 'Content-Type': 'application/json;charset=UTF-8'
                }
                body (
                        name: "Poruct 2"
                )
            }
        },
        Contract.make {
            description "get prodct name by id==0"
            request {
                url "/getProductName?id=0"
                method GET()
            }
            response {
                status 200
                headers{
                    header 'Content-Type': 'application/json;charset=UTF-8'
                }
                body (
                        name: "Product is not existent"
                )
            }
        }
]