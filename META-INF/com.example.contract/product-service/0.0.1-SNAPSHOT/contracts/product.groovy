import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            description "get product when id > 0"
            request {
                url "/getProductById?id=2"
                method GET()
            }
            response {
                status 200
                body (
                        productName: "Product Name 2"
                )
            }
        },
        Contract.make {
            description "get product when id==0"
            request {
                url "/getProductById?id=0"
                method GET()
            }
            response {
                status 404
                body (
                       "Product not found"
                )
            }
        }
]