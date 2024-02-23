<template>
    <v-card outlined>
        <v-card-title>
            RegisterProduct
        </v-card-title>

        <v-card-text>
            <String label="PrductName" v-model="value.prductName" :editMode="editMode"/>
            <Number label="Qty" v-model="value.qty" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="registerProduct"
            >
                RegisterProduct
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'RegisterProductCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.prductName = '';
            this.value.qty = 0;
        },
        watch: {
        },
        methods: {
            registerProduct() {
                this.$emit('registerProduct', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

